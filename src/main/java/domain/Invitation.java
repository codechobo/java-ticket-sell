package domain;

import java.time.LocalDateTime;

public class Invitation {

    private String to;
    private LocalDateTime when;
    private String message;
    private String from;
    private LocalDateTime createAt;

    public Invitation(String to, LocalDateTime when, String message, String from) {
        this.to = to;
        this.when = when;
        this.message = message;
        this.from = from;
        this.createAt = LocalDateTime.now();
    }
}
