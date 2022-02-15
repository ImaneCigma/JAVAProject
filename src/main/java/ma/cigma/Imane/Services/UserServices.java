package ma.cigma.Imane.Services;

        import ma.cigma.Imane.entity.User;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;

public interface UserServices {

    Page<User> ShowUsers (Pageable page);

    User fill (User U);

    Page<User> selectAll(Pageable ofSize);
}