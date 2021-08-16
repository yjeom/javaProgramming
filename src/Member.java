public class Member {
    private final String email;
    private final String password;
    private final String name;
    private final String telephone;
    private final String address;

    public static class Builder{
        private final String email;
        private final String password;
        private final String name;
        private final String telephone;
        private  String address;

        public Builder(String email,String password,String name,String telephone){
            this.email=email;
            this.password=password;
            this.name=name;
            this.telephone=telephone;
        }
        public Builder address(String address){
            this.address=address;
            return this;
        }
        public Member build(){
            return new Member(this);
        }
    }
    private Member(Builder builder){
        email=builder.email;
        password=builder.password;
        name=builder.name;
        telephone=builder.telephone;
        address=builder.address;
    }

}
class MemberTest{
    public static void main(String[]args){
        Member.Builder builder=new Member.Builder(
                "member1@test.com","1234","김아무개","010-1234-5678");
        builder.address("서울");
        Member m=builder.build();
    }
}