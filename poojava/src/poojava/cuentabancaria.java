package poojava;

public class cuentabancaria {

		// atributo clase
		String institucion= "";
		String beneficiario= "";
		float saldo = 0;
		long cuenta = 0;
		String producto = "";
		String direccion = "";
		String rfc = "";
		
		cuentabancaria(){
			
		}
		
		cuentabancaria(String beneficiario){
			this.beneficiario = beneficiario;
		}
		
	
		cuentabancaria(String beneficiario, float saldo){
			this.beneficiario = beneficiario;
			this.saldo = saldo;
		}
		
		// metodos de la clase
		
		public void depositos(float monto) {
			this.saldo = this.saldo + monto;
		}
		public void retiros(float monto) {
			if(monto < this.saldo && monto > 0) {
				this.saldo = this.saldo - monto;
			}	
		}

		public float consultarsaldo() {
			return this.saldo;
		}
		
		public String estadodecuenta() {
			return "";
		}

		
}
