package dev.hendrix.FeedSense.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SentimentAnalysisResult {
    private String sentimentLabel; // Ex: "positivo", "negativo", "neutro"
    private Double score; // Ex: 0.92
    private String summary; // Ex: "O usuário elogiou o atendimento, mas reclamou do tempo de espera."
    private String suggestedAction; // Ex: "Entrar em contato para entender o motivo da demora."
    private String keywords; // Ex: "atendimento, espera, elogio"
    @Column(length = 1000)
    private String aiComment; // Ex: "O feedback é majoritariamente positivo, mas há uma preocupação com o tempo de espera."
}
