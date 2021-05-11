package io.inbuilt;
import java.util.function.Supplier;
public class JavaSupplier {

	 
	 public static void main(String[] args) {
	 
	  Supplier<String> supplier= ()-> "Ankan";
	  System.out.println(supplier.get());
	 }
	}