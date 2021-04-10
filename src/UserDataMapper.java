import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDataMapper {
    private final Connection connection;

    public UserDataMapper(Connection connection) {
        this.connection  = connection;
    }
    public User findById(int userId) throws SQLException,RecordNotFoundException{
        PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM PERSON WHERE ID = ?");
        statement.setInt(1,userId);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                return new User(resultSet.getString(2),resultSet.getString(3));



            }
        }

        throw new RecordNotFoundException(userId);
    }
    public void insert(User user) throws SQLException {
        PreparedStatement st = connection.prepareStatement("INSERT INTO Customers " +
                "VALUES ('Springfield', 'abc@gamil.com'");
        st.execute();
    }

    public void update(User user) throws SQLException {
        PreparedStatement st=connection.prepareStatement("update USER SET NAME ='spruigfield1' WHERE ID=?");
        st.setString(1,user.getId().toString());
        st.execute();
    }

    public void delete(User user) throws SQLException {
        PreparedStatement st=connection.prepareStatement("delete  from user WHERE ID=?");
        st.setString(1,user.getId().toString());
        st.execute();
    }



}
