package Models;

import java.util.Date;
import java.util.List;

public class Bill {
    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private BillStatus billStatus;
    private List<Payment> paymentList;
    private Gate gate;
    private Operator operator;
    private FeesCalculatorStratergyType feesCalculatorStratergyType;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public FeesCalculatorStratergyType getFeesCalculatorStratergyType() {
        return feesCalculatorStratergyType;
    }

    public void setFeesCalculatorStratergyType(FeesCalculatorStratergyType feesCalculatorStratergyType) {
        this.feesCalculatorStratergyType = feesCalculatorStratergyType;
    }
}
