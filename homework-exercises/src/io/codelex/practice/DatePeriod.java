package io.codelex.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }
    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (this.start.isAfter(secondPeriod.end) || this.end.isBefore(secondPeriod.start)) {
            return null;
        }
        LocalDate start = this.start.isAfter(secondPeriod.start) ? this.start : secondPeriod.start;
        LocalDate end = this.end.isBefore(secondPeriod.end) ? this.end : secondPeriod.end;
        return new DatePeriod(start, end);
    }
}
