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
		double number = 3.0;
		
		Installment inst = new Installment(doeDate, number);
		
		System.out.printf(" Parcela #%d: %td/%tm/%tY - %fR$ \n", i,inst.getDueDate(),inst.getDueDate(),inst.getDueDate(), inst.getAmount());
		
		}
		
		 
		
	}
	
}
