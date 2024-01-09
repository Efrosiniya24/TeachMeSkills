package homework33;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private int age;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && id == user.id && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
    public User surfaceCloning() throws CloneNotSupportedException {
        return (User) super.clone();
    }
    public User deepCloning() throws CloneNotSupportedException {
        User user = (User) super.clone();
        return user;
    }
}

