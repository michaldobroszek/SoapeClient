
package org.me.calculator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.calculator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://calculator.me.org/", "hello");
    private final static QName _AddResponse_QNAME = new QName("http://calculator.me.org/", "addResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://calculator.me.org/", "helloResponse");
    private final static QName _ModResponse_QNAME = new QName("http://calculator.me.org/", "modResponse");
    private final static QName _Mod_QNAME = new QName("http://calculator.me.org/", "mod");
    private final static QName _Add_QNAME = new QName("http://calculator.me.org/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Mod }
     * 
     */
    public Mod createMod() {
        return new Mod();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ModResponse }
     * 
     */
    public ModResponse createModResponse() {
        return new ModResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "modResponse")
    public JAXBElement<ModResponse> createModResponse(ModResponse value) {
        return new JAXBElement<ModResponse>(_ModResponse_QNAME, ModResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "mod")
    public JAXBElement<Mod> createMod(Mod value) {
        return new JAXBElement<Mod>(_Mod_QNAME, Mod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
