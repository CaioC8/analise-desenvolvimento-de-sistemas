export class TransportadoraExterna {
  enviarParaDestinatario(
    assinatura: string,
    enderecoDestinatario: string,
    nomeDestinatario: string,
  ): number {
    if (!assinatura) {
      throw new Error("Assinatura não informada.");
    }

    if (!enderecoDestinatario) {
      throw new Error("Endereço do destinatário não informado.");
    }

    if (!nomeDestinatario) {
      throw new Error("Nome do destinatário não informado.");
    }

    return 100; // 100 Km
  }
}
