package roomescape.reservation.controller;

import java.time.LocalDate;

public class ReservationRequest {

    private final String name;
    private final LocalDate date;
    private final Long timeId;

    public ReservationRequest(final String name, final LocalDate date, final Long timeId) {
        this.name = name;
        this.date = date;
        this.timeId = timeId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getTimeId() {
        return timeId;
    }
}