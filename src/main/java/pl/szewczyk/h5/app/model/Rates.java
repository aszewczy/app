package pl.szewczyk.h5.app.model;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "USD",
        "AED",
        "ARS",
        "AUD",
        "BGN",
        "BRL",
        "BSD",
        "CAD",
        "CHF",
        "CLP",
        "CNY",
        "COP",
        "CZK",
        "DKK",
        "DOP",
        "EGP",
        "EUR",
        "FJD",
        "GBP",
        "GTQ",
        "HKD",
        "HRK",
        "HUF",
        "IDR",
        "ILS",
        "INR",
        "ISK",
        "JPY",
        "KRW",
        "KZT",
        "MXN",
        "MYR",
        "NOK",
        "NZD",
        "PAB",
        "PEN",
        "PHP",
        "PKR",
        "PLN",
        "PYG",
        "RON",
        "RUB",
        "SAR",
        "SEK",
        "SGD",
        "THB",
        "TRY",
        "TWD",
        "UAH",
        "UYU",
        "VND",
        "ZAR"
})
public class Rates {

    @JsonProperty("USD")
    private Integer uSD;
    @JsonProperty("AED")
    private Double aED;
    @JsonProperty("ARS")
    private Double aRS;
    @JsonProperty("AUD")
    private Double aUD;
    @JsonProperty("BGN")
    private Double bGN;
    @JsonProperty("BRL")
    private Double bRL;
    @JsonProperty("BSD")
    private Integer bSD;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("CLP")
    private Double cLP;
    @JsonProperty("CNY")
    private Double cNY;
    @JsonProperty("COP")
    private Double cOP;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("DOP")
    private Double dOP;
    @JsonProperty("EGP")
    private Double eGP;
    @JsonProperty("EUR")
    private Double eUR;
    @JsonProperty("FJD")
    private Double fJD;
    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("GTQ")
    private Double gTQ;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("HRK")
    private Double hRK;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("IDR")
    private Double iDR;
    @JsonProperty("ILS")
    private Double iLS;
    @JsonProperty("INR")
    private Double iNR;
    @JsonProperty("ISK")
    private Double iSK;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("KZT")
    private Double kZT;
    @JsonProperty("MXN")
    private Double mXN;
    @JsonProperty("MYR")
    private Double mYR;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("PAB")
    private Integer pAB;
    @JsonProperty("PEN")
    private Double pEN;
    @JsonProperty("PHP")
    private Double pHP;
    @JsonProperty("PKR")
    private Double pKR;
    @JsonProperty("PLN")
    private Double pLN;
    @JsonProperty("PYG")
    private Double pYG;
    @JsonProperty("RON")
    private Double rON;
    @JsonProperty("RUB")
    private Double rUB;
    @JsonProperty("SAR")
    private Double sAR;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("THB")
    private Double tHB;
    @JsonProperty("TRY")
    private Double tRY;
    @JsonProperty("TWD")
    private Double tWD;
    @JsonProperty("UAH")
    private Double uAH;
    @JsonProperty("UYU")
    private Double uYU;
    @JsonProperty("VND")
    private Double vND;
    @JsonProperty("ZAR")
    private Double zAR;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("USD")
    public Integer getUSD() {
        return uSD;
    }

    @JsonProperty("USD")
    public void setUSD(Integer uSD) {
        this.uSD = uSD;
    }

    @JsonProperty("AED")
    public Double getAED() {
        return aED;
    }

    @JsonProperty("AED")
    public void setAED(Double aED) {
        this.aED = aED;
    }

    @JsonProperty("ARS")
    public Double getARS() {
        return aRS;
    }

    @JsonProperty("ARS")
    public void setARS(Double aRS) {
        this.aRS = aRS;
    }

    @JsonProperty("AUD")
    public Double getAUD() {
        return aUD;
    }

    @JsonProperty("AUD")
    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    @JsonProperty("BGN")
    public Double getBGN() {
        return bGN;
    }

    @JsonProperty("BGN")
    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    @JsonProperty("BRL")
    public Double getBRL() {
        return bRL;
    }

    @JsonProperty("BRL")
    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    @JsonProperty("BSD")
    public Integer getBSD() {
        return bSD;
    }

    @JsonProperty("BSD")
    public void setBSD(Integer bSD) {
        this.bSD = bSD;
    }

    @JsonProperty("CAD")
    public Double getCAD() {
        return cAD;
    }

    @JsonProperty("CAD")
    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    @JsonProperty("CHF")
    public Double getCHF() {
        return cHF;
    }

    @JsonProperty("CHF")
    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    @JsonProperty("CLP")
    public Double getCLP() {
        return cLP;
    }

    @JsonProperty("CLP")
    public void setCLP(Double cLP) {
        this.cLP = cLP;
    }

    @JsonProperty("CNY")
    public Double getCNY() {
        return cNY;
    }

    @JsonProperty("CNY")
    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    @JsonProperty("COP")
    public Double getCOP() {
        return cOP;
    }

    @JsonProperty("COP")
    public void setCOP(Double cOP) {
        this.cOP = cOP;
    }

    @JsonProperty("CZK")
    public Double getCZK() {
        return cZK;
    }

    @JsonProperty("CZK")
    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    @JsonProperty("DKK")
    public Double getDKK() {
        return dKK;
    }

    @JsonProperty("DKK")
    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    @JsonProperty("DOP")
    public Double getDOP() {
        return dOP;
    }

    @JsonProperty("DOP")
    public void setDOP(Double dOP) {
        this.dOP = dOP;
    }

    @JsonProperty("EGP")
    public Double getEGP() {
        return eGP;
    }

    @JsonProperty("EGP")
    public void setEGP(Double eGP) {
        this.eGP = eGP;
    }

    @JsonProperty("EUR")
    public Double getEUR() {
        return eUR;
    }

    @JsonProperty("EUR")
    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

    @JsonProperty("FJD")
    public Double getFJD() {
        return fJD;
    }

    @JsonProperty("FJD")
    public void setFJD(Double fJD) {
        this.fJD = fJD;
    }

    @JsonProperty("GBP")
    public Double getGBP() {
        return gBP;
    }

    @JsonProperty("GBP")
    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    @JsonProperty("GTQ")
    public Double getGTQ() {
        return gTQ;
    }

    @JsonProperty("GTQ")
    public void setGTQ(Double gTQ) {
        this.gTQ = gTQ;
    }

    @JsonProperty("HKD")
    public Double getHKD() {
        return hKD;
    }

    @JsonProperty("HKD")
    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    @JsonProperty("HRK")
    public Double getHRK() {
        return hRK;
    }

    @JsonProperty("HRK")
    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    @JsonProperty("HUF")
    public Double getHUF() {
        return hUF;
    }

    @JsonProperty("HUF")
    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    @JsonProperty("IDR")
    public Double getIDR() {
        return iDR;
    }

    @JsonProperty("IDR")
    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    @JsonProperty("ILS")
    public Double getILS() {
        return iLS;
    }

    @JsonProperty("ILS")
    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    @JsonProperty("INR")
    public Double getINR() {
        return iNR;
    }

    @JsonProperty("INR")
    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    @JsonProperty("ISK")
    public Double getISK() {
        return iSK;
    }

    @JsonProperty("ISK")
    public void setISK(Double iSK) {
        this.iSK = iSK;
    }

    @JsonProperty("JPY")
    public Double getJPY() {
        return jPY;
    }

    @JsonProperty("JPY")
    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    @JsonProperty("KRW")
    public Double getKRW() {
        return kRW;
    }

    @JsonProperty("KRW")
    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    @JsonProperty("KZT")
    public Double getKZT() {
        return kZT;
    }

    @JsonProperty("KZT")
    public void setKZT(Double kZT) {
        this.kZT = kZT;
    }

    @JsonProperty("MXN")
    public Double getMXN() {
        return mXN;
    }

    @JsonProperty("MXN")
    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    @JsonProperty("MYR")
    public Double getMYR() {
        return mYR;
    }

    @JsonProperty("MYR")
    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    @JsonProperty("NOK")
    public Double getNOK() {
        return nOK;
    }

    @JsonProperty("NOK")
    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    @JsonProperty("NZD")
    public Double getNZD() {
        return nZD;
    }

    @JsonProperty("NZD")
    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    @JsonProperty("PAB")
    public Integer getPAB() {
        return pAB;
    }

    @JsonProperty("PAB")
    public void setPAB(Integer pAB) {
        this.pAB = pAB;
    }

    @JsonProperty("PEN")
    public Double getPEN() {
        return pEN;
    }

    @JsonProperty("PEN")
    public void setPEN(Double pEN) {
        this.pEN = pEN;
    }

    @JsonProperty("PHP")
    public Double getPHP() {
        return pHP;
    }

    @JsonProperty("PHP")
    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    @JsonProperty("PKR")
    public Double getPKR() {
        return pKR;
    }

    @JsonProperty("PKR")
    public void setPKR(Double pKR) {
        this.pKR = pKR;
    }

    @JsonProperty("PLN")
    public Double getPLN() {
        return pLN;
    }

    @JsonProperty("PLN")
    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    @JsonProperty("PYG")
    public Double getPYG() {
        return pYG;
    }

    @JsonProperty("PYG")
    public void setPYG(Double pYG) {
        this.pYG = pYG;
    }

    @JsonProperty("RON")
    public Double getRON() {
        return rON;
    }

    @JsonProperty("RON")
    public void setRON(Double rON) {
        this.rON = rON;
    }

    @JsonProperty("RUB")
    public Double getRUB() {
        return rUB;
    }

    @JsonProperty("RUB")
    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    @JsonProperty("SAR")
    public Double getSAR() {
        return sAR;
    }

    @JsonProperty("SAR")
    public void setSAR(Double sAR) {
        this.sAR = sAR;
    }

    @JsonProperty("SEK")
    public Double getSEK() {
        return sEK;
    }

    @JsonProperty("SEK")
    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    @JsonProperty("SGD")
    public Double getSGD() {
        return sGD;
    }

    @JsonProperty("SGD")
    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    @JsonProperty("THB")
    public Double getTHB() {
        return tHB;
    }

    @JsonProperty("THB")
    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    @JsonProperty("TRY")
    public Double getTRY() {
        return tRY;
    }

    @JsonProperty("TRY")
    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    @JsonProperty("TWD")
    public Double getTWD() {
        return tWD;
    }

    @JsonProperty("TWD")
    public void setTWD(Double tWD) {
        this.tWD = tWD;
    }

    @JsonProperty("UAH")
    public Double getUAH() {
        return uAH;
    }

    @JsonProperty("UAH")
    public void setUAH(Double uAH) {
        this.uAH = uAH;
    }

    @JsonProperty("UYU")
    public Double getUYU() {
        return uYU;
    }

    @JsonProperty("UYU")
    public void setUYU(Double uYU) {
        this.uYU = uYU;
    }

    @JsonProperty("VND")
    public Double getVND() {
        return vND;
    }

    @JsonProperty("VND")
    public void setVND(Double vND) {
        this.vND = vND;
    }

    @JsonProperty("ZAR")
    public Double getZAR() {
        return zAR;
    }

    @JsonProperty("ZAR")
    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
