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
		
	
		public String getInstitucion() {
			return institucion;
		}

		public void setInstitucion(String institucion) {
			this.institucion = institucion;
		}

		public String getBeneficiario() {
			return beneficiario;
		}

		public void setBeneficiario(String beneficiario) {
			this.beneficiario = beneficiario;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
		 if (saldo > 0) {
			this.saldo = saldo;
		 }else {
			 throw new IllegalArgumentException("el saldo ingresado es invalido");
		 }
		}

		public long getCuenta() {
			return cuenta;
		}

		public void setCuenta(long cuenta) {
			this.cuenta = cuenta;
		}

		public String getProducto() {
			return producto;
		}

		public void setProducto(String producto) {
			this.producto = producto;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getRfc() {
			return rfc;
		}

		public void setRfc(String rfc) {
			this.rfc = rfc;
		}

		cuentabancaria(String beneficiario, float saldo){
			this.beneficiario = beneficiario;
			this.saldo = saldo;
		}
		
		// getter y los setter
		// get obtengo valor
		// set escribo el valor
		
		public String getinstitucion () {
			return this.institucion;
		}
		
		public void getinstitucion (String institucion) {
			this.institucion = institucion;
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
