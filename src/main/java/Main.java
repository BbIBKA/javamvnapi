public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 15;
        post.birthday.month = 02;
        post.birthday.year = 1991;
        post.name = "Денис";
        post.passport = "1234 № 123456";
        post.patronymic = "Викторович";
        post.phone = "+71234567889";
        post.surname = "Шестернин";
        post.subscriprion = true;
    }
}
