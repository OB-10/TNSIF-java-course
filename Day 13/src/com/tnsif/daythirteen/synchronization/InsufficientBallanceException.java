package com.tnsif.daythirteen.synchronization;

public class InsufficientBallanceException {

	public InsufficientBalanceException()
	{
		super("Insufficient balance in your account");
	}
	
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}



