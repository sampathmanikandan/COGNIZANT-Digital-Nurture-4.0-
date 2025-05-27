import java.sql.*;

public class BankTransaction {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "your_password");

        try {
            conn.setAutoCommit(false);
            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");

            debit.setDouble(1, 1000);
            debit.setInt(2, 1); // From account 1

            credit.setDouble(1, 1000);
            credit.setInt(2, 2); // To account 2

            debit.executeUpdate();
            credit.executeUpdate();

            conn.commit();
            System.out.println("Transfer successful.");
        } catch (Exception e) {
            conn.rollback();
            System.out.println("Transfer failed. Transaction rolled back.");
        } finally {
            conn.close();
        }
    }
}
