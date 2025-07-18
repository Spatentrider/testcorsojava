import java.util.*;

interface Observer {
    void update(String message);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " ha ricevuto la notifica: " + message);
    }
}

interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}

class NotificationService implements Subject {
    private static NotificationService instance;
    private List<Observer> observers = new ArrayList<>();

    private NotificationService() {}

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void sendNotification(Notification notification) {
        System.out.println("Invio notifica: " + notification.getMessage());
        notifyObservers(notification.getMessage());
    }
}

abstract class Notification {
    public abstract String getMessage();
}

class EmailNotification extends Notification {
    public String getMessage() {
        return "Email: Hai ricevuto un messaggio";
    }
}

class SMSNotification extends Notification {
    public String getMessage() {
        return "SMS: Hai ricevuto un sms";
    }
}

class PushNotification extends Notification {
    public String getMessage() {
        return "Push: Hai ricevuto una notifica push";
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Tipo di notifica non supportato: " + type);
        }
    }
}

public class Esercizio3 {
    public static void main(String[] args) {

        NotificationService service = NotificationService.getInstance();

        User user1 = new User("Luca");
        User user2 = new User("Anna");
        User user3 = new User("Giulia");

        service.addObserver(user1);
        service.addObserver(user2);
        service.addObserver(user3);

        Notification notifica = NotificationFactory.createNotification("email");

        service.sendNotification(notifica);
    }
}

