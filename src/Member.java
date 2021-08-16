public class Member {
    private final String email;
    private final String password;
    private final String name;
    private final String telephone;
    private final String address;

    public Member(String email,String password,String name,String telephone,String address){
        this.email=email;
        this.password=password;
        this.name=name;
        this.telephone=telephone;
        this.address=address;

    }
    public Member(String email,String password,String name,String telephone) {
        this(email,password,name,telephone,"모름");
    }
}
class MemberTest{
    public static void main(String[]args){
        final Member m=new Member("member1@test.com","1234"
                ,"김아무개","010-1234-5678","서울");
    }
}