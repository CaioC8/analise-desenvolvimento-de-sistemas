public class Usuario {
  private String email;
  private String senha;
  private String codigo2F;

  public Usuario(String email, String senha, String codigo2F) {
    this.email = email;
    this.senha = senha;
    this.codigo2F = codigo2F;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getCodigo2F() {
    return codigo2F;
  }

  public void setCodigo2F(String codigo2F) {
    this.codigo2F = codigo2F;
  }
}
