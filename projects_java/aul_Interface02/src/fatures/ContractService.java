package fatures;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	public void processContract(Contract contract, int months) {
		
		for (int i = 1; i <= months; i = i+1) {
			
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		cal.add(Calendar.MONTH, i);
		
//		Date de vencimento
		Date doeDate = cal.getTime();
		
//		Valor a se pagar neste mês
		double amout = contract.getTotalValue()/months;
		
		PaypallService ps = new PaypallService();
		
		double acount = ps.interest(amout, i);
		
		double fatureValue = ps.paymentFee(acount);
		
		Installment inst = new Installment(doeDate, fatureValue);
		
		System.out.printf(" Parcela #%d: %td/%tm/%tY - %.2fR$ \n", i,inst.getDueDate(),inst.getDueDate(),inst.getDueDate(), inst.getAmount());
		
		}
		
		 
		
	}
	
}
