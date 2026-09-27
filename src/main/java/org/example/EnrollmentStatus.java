package org.example;

public enum EnrollmentStatus {
    PENDING(false),
    ACTIVE(false),
    CANCELLED(true),
    COMPLETED(true);

    private final boolean terminal;

    EnrollmentStatus(boolean terminal) {
        this.terminal = terminal;
    }

    public boolean canTransitionTo(EnrollmentStatus target) {
        if (target == null || this.terminal) {
            return false;
        }

        return switch (this) {
            case PENDING -> target == ACTIVE || target == CANCELLED;
            case ACTIVE -> target == COMPLETED || target == CANCELLED;
            case CANCELLED, COMPLETED -> false;
        };
    }
}
