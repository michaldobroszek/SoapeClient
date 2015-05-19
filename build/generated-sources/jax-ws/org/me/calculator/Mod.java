
package org.me.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mod", propOrder = {
    "x",
    "y"
})
public class Mod {

    protected float x;
    protected float y;

    /**
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

}
