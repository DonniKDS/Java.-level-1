public class Main {

    public static void main(String[] args) {
		Worker[] workers = new Worker[5];
		workers[0] = new Worker("Ivanov Ivan", "Engineer", "ivanov@mailbox.com", "89871111111", 35000, 34);
		workers[1] = new Worker("Petrov Peter", "Engineer", "petrov@mailbox.com", "89872222222", 40000, 42);
		workers[2] = new Worker("Sidorov Sidor", "Engineer", "sidorov@mailbox.com", "89873333333", 38000, 45);
		workers[3] = new Worker("Anastasieva Anastasia", "manager", "anastasieva@mailbox.com", "89874444444", 55000, 38);
		workers[4] = new Worker("Vovanov Vova", "director", "vovanov@mailbox.com", "89877777777", 350000, 44);
		for (int i = 0; i < workers.length; i++){
			if (workers[i].getAge() >= 40){
	        	workers[i].info();
        	}
    	}
    }
}
