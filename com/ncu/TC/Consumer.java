package com.ncu.TC;
public class Consumer 
{
	 Iworker iw;
	 Consumer(Iworker iw)
	 {
		 this.iw=iw;
	 }
	 public void consumer()
	 {
		 iw.work();
	 }
}