package builder;

public class ClientePJ extends Cliente{
	
	private String RazaoSocial;
	private String CNPJ;
	
	public ClientePJ(String razaoSocial, String cnpj){
		this.RazaoSocial = razaoSocial;
		this.CNPJ = cnpj;
	}
	
	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	

}
