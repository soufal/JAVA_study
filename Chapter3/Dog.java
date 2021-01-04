//create a class named Dog
class Dog {
    //Dog hava a instance variable name
    String name;

    //增加一个size实例变量，bark使用其来决定使用哪一种声音
	int size;

    //Dog's method

    //create the bark method of Dog
    public void bark() {
    	if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 14) {
    		System.out.println(("Ruff! Ruff!"));
		} else {
    		System.out.println("Yip! Yip!");
		}

    }

    public int theSecret(int secret) {
    	return secret;
	}

}
