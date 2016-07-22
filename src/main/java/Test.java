import com.sixsystems.valueof.Value;

public class Test {

    public static void main(String[] args) {

        String firstName = "Alexander";

        Value.of(firstName).should.startsWith("Alex").and.have.lengthBetween(1,2);
        Value.of(firstName).should.have.lengthBetween(1, 5);

        Value.of(firstName).have.length(10);


    }
}
