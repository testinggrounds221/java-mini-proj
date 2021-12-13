import java.io.IOException;

import operations.Operations;

public class testOps {
	Operations op;

	public static void main(String[] args) throws IOException {
		Operations op = new Operations("detailsRam.txt");
		String dat[] = { "1", "21122" };
		op.createRecord(dat);
		System.out.println(op.deleteRecord("SiniKutan"));

	}
}
