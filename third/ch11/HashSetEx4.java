package third.ch11;

import java.util.HashSet;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person3("David", 10));
		set.add(new Person3("David", 10));

		System.out.println(set);
	}
}

class Person3 {
	String name;
	int age;

	Person3(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public boolean equals(Object obj) {
		if(obj instanceof Person3) {
			Person3 tmp = (Person3) obj;
			return this.name.equals(tmp.name) && this.age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return (name+age).hashCode();
	}

	public String toString() {
		return name + ":" + age;
	}
}
