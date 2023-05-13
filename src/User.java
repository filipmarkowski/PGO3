class User {
    private String name;
    private String surname;
    private String mail;
    private String password;
    private boolean guest;

    public User(String name, String surname, String mail, String password) {
        setName(name);
        setSurname(surname);
        setMail(mail);
        setPassword(password);
        setGuest(guest);
    }

    public User(String mail){
        this.name = "";
        this.surname = "";
        setMail(mail);
        this.password = "";
        setGuest(guest);
    }


    //Methods

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Mail
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail==null || mail==""){
            throw new IllegalArgumentException("Mail cannot be null");
        }
        if(!mail.contains("@")){
            throw new IllegalArgumentException("Mail is incorrect");
        }
        this.mail = mail;
    }

    //Password
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        if (password==null){
            throw new IllegalArgumentException("Password cannot be null");
        }
        this.password = password;
    }
    //Guest
    public boolean getGuest(){
        return guest;
    }

    public void setGuest(boolean guest){
        if (name==null || name=="") {
            this.guest = true;
            //System.out.println("Zakupy jako gosc");
        } else {
            this.guest = false;
            //System.out.println("Zakupy jako " + name);
        }
        this.guest = guest;
    }

    public void getRegister(String name, String surname, String password){
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

}