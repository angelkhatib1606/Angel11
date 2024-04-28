package kh.adam11.data.MyUserTable;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;
@Dao
public interface MyUserQuery
List<MyUsser> getAll ();
List<MyUsser> loadAllByIds (int [] userIds);
MyUser checkEmailPassw (String myEmail , String myPassw);
MyUser checkEmail (String myEmail);
void insertAll(MyUser... users);
void delete (MyUser users);
void insert (MyUser myUser);
void update (MyUser... values);

@Dao

public interface MyUserQuery
{
        @Query("SELECT * FROM MyUser")
        List<MyUser> getAll();
        @Query("SELECT * FROM MyUser WHERE keyid IN (:userIds)")
        List<MyUser> loadAllByIds(int[] userIds);
        @Query("SELECT * FROM MyUser WHERE email = :myEmail AND passw = :myPassw LIMIT 1")
        MyUser checkEmailPassw(String myEmail , String myPassw);
        @Query("SELECT * FROM MyUser WHERE email = :myEmail LIMIT 1")
        MyUser checkEmail (String myEmail);
        void insertAll (MyUser... users);
        void delete (MyUser user);
        void insert (MyUser myUser);
        void update (MyUser...values);


}
