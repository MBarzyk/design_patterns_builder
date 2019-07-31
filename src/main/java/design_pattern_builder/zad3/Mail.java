package design_pattern_builder.zad3;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Mail {
    private String content, sender;
    private LocalDateTime dateSend;
    private LocalDateTime dateReceive;
    private String IPsender;
    private String IPreceiver;
    private String proxyName;
    private String postboxName;
    private String communicationProtocol;
    private MessageType messageType;
    private boolean isEncrypted;
    private boolean isSpam;

    public Mail(String content, String sender, LocalDateTime dateSend, LocalDateTime dateReceive, String IPsender, String IPreceiver, String proxyName, String postboxName, String communicationProtocol, MessageType messageType, boolean isEncrypted, boolean isSpam) {
        this.content = content;
        this.sender = sender;
        this.dateSend = dateSend;
        this.dateReceive = dateReceive;
        this.IPsender = IPsender;
        this.IPreceiver = IPreceiver;
        this.proxyName = proxyName;
        this.postboxName = postboxName;
        this.communicationProtocol = communicationProtocol;
        this.messageType = messageType;
        this.isEncrypted = isEncrypted;
        this.isSpam = isSpam;
    }

    public static class Builder {

        private String content;
        private String sender;
        private LocalDateTime dateSend = LocalDateTime.now();
        private LocalDateTime dateReceive = LocalDateTime.now().plusSeconds(10);
        private String iPsender;
        private String iPreceiver;
        private String proxyName = "proxy.example_v1.google.com";
        private String postboxName = "Gmail postbox";
        private String communicationProtocol = "POP3";
        private MessageType messageType;
        private boolean isEncrypted = true;
        private boolean isSpam = false;

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder setDateSend(LocalDateTime dateSend) {
            this.dateSend = dateSend;
            return this;
        }

        public Builder setDateReceive(LocalDateTime dateReceive) {
            this.dateReceive = dateReceive;
            return this;
        }

        public Builder setIPsender(String iPsender) {
            this.iPsender = iPsender;
            return this;
        }

        public Builder setIPreceiver(String iPreceiver) {
            this.iPreceiver = iPreceiver;
            return this;
        }

        public Builder setProxyName(String proxyName) {
            this.proxyName = proxyName;
            return this;
        }

        public Builder setPostboxName(String postboxName) {
            this.postboxName = postboxName;
            return this;
        }

        public Builder setCommunicationProtocol(String communicationProtocol) {
            this.communicationProtocol = communicationProtocol;
            return this;
        }

        public Builder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setIsEncrypted(boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }

        public Builder setIsSpam(boolean isSpam) {
            this.isSpam = isSpam;
            return this;
        }

        public Mail createMail() {
            return new Mail(content, sender, dateSend, dateReceive, iPsender, iPreceiver, proxyName, postboxName, communicationProtocol, messageType, isEncrypted, isSpam);
        }
    }
}
