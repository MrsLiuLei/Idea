package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User1 {
    private int id;
    private String name;
    private String sex;
    private Date birthday;
    private String address;
    private List<Account1> list;
}
