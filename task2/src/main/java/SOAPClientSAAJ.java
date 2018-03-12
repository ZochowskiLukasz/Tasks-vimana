import javax.xml.soap.*;

public class SOAPClientSAAJ {

    public static void main(String args[]) {

        String soapEndpointUrl = "http://localhost:8088/mockCurrencyExchangeBinding";
        String soapAction = "http://localhost:8088/mockCurrencyExchangeBinding?WSDL";

        callSoapWebService(soapEndpointUrl, soapAction);
    }

    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String urn = "urn";
        String country1 = "country1";
        String country2 = "country2";
        String myNamespaceURI = "http://localhost:8088/";

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(urn, myNamespaceURI);
        envelope.addNamespaceDeclaration(country1, myNamespaceURI);
        envelope.addNamespaceDeclaration(country2, myNamespaceURI);

        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("getRate", urn);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(country1);
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement(country2);
        soapBodyElem1.addTextNode("Poland");
        soapBodyElem2.addTextNode("China");
    }

    private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }

}