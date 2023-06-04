package nguyenthilinhchi.kiemtracanhan.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column
    private String ma;
    @Column
    private  String ten;
    @Column
    private  String noi;
    @Column
    private int luong;
    @Column
    private String phai;
//    @Column
//    private String phongban;
    @ManyToOne
    private  PhongBan phongban;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;
}
