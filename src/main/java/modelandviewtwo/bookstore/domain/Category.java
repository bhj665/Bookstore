package modelandviewtwo.bookstore.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int categoryid;
private String name;
public Category(int categoryid, String name) {
this.categoryid = 0;
this.name = null;
}
public int getCategoryid() {
return categoryid;
}
public void setCategoryid(int categoryid) {
this.categoryid = categoryid;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
@Override
public String toString() {
return this.categoryid + this.name;
}
}
