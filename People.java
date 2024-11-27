package People;
public abstract class People {
    public String Name;
    public double Id;
    public double Phone;
    public String Email;
    public String Address;

    // Default constructor
    public People() {
    }

    public People(String name, double id, double phone, String email, String address){
        this.Name = name;
        this.Id = id;
        this.Phone = phone;
        this.Email = email;
        this.Address = address;
    }


    public void setId(double id) {
        Id = id;
    }

    public double getId() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setPhone(double phone) {
        Phone = phone;
    }

    public double getPhone() {
        return Phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void display(){
        System.out.println("Name :"+getName());
        System.out.println("ID :"+getId());
        System.out.println("Phone Number :"+getPhone());
        System.out.println("Email address :"+getAddress());
        System.out.println("Address :"+getAddress());
    }
}
