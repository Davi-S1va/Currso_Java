package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> item =new ArrayList<>();
	
	 private static SimpleDateFormat sdf =
	            new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	public Order() {
	}

	public Order(Date moment, OrderStatus status,Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;

	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getitem() {
		return item;
	}
	public Client getClient() {
	    return client;
	}
	public void addItem(OrderItem Item) {
		item.add(Item);	
	}
	
	public void removeItem(OrderItem Item) {
		item.remove(Item);	
	}
	public double total() {
	    double sum = 0.0;
	    for (OrderItem item : item) {
	        sum += item.subTotal();
	    }
	    return sum;
	}
	public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items:\n");

        for (OrderItem item : item) {
            sb.append(item).append("\n");
        }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
	
	
	
	
	
	
	

}
