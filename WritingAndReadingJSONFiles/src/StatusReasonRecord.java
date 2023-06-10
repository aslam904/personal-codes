public class StatusReasonRecord {
    String reason;
    String status;

    public StatusReasonRecord(String reason, String status) {
        this.reason = reason;
        this.status = status;
    }

    public StatusReasonRecord() {

    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusReasonRecord{" +
                "reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
