package ex0806.sample02;


/**
 * �������� �������
 * 
 */




public  class PartTime extends Employee {
	private int timePay;
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()+"|");
		builder.append(timePay);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	public PartTime() {
		super();
		// TODO Auto-generated constructor stub
	}




	public PartTime(int empNo, String empName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, empName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
		
		// TODO Auto-generated constructor stub
	}




	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}


	
	/** �����Ǹ� �� �żҵ�
	 * 
	 */
	public void message() {
		System.out.println(getEmpName()+"���� ������Ģ�Դϴ�.");
	}

}
