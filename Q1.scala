// SCS2204 Tutorial 06 Question 01
object Q1 {
    // Starting point
    def main(args: Array[String]) = {
        println(Encryption("#Visit Sri Lanka",5));
        println(Decryption("Gjfzyd tk Htqtrgt",5));
    }

    // Encrypting function
    def Encryption(PlainText: String, Shift :Int): String = {
        var EncryptText = "";

        for (character <- PlainText)
            yield if(character.toInt >= 97 && character.toInt <= 122) {
                        EncryptText += ((((character.toInt) + 26 - 97 + Shift) % 26) + 97).toChar;
                    } else if(character.toInt >= 65 && character.toInt <= 90) {
                        EncryptText += ((((character.toInt) + 26 - 65 + Shift) % 26) + 65).toChar;
                    } else {
                        EncryptText += character;
                    }

        return EncryptText;
    }

    // Decrypting function
    def Decryption(EncryptText: String, Shift :Int): String = {
        var PlainText = "";

        for (character <- EncryptText)
            yield if(character.toInt >= 97 && character.toInt <= 122) {
                        PlainText += ((((character.toInt) + 26 - 97 - Shift) % 26) + 97).toChar;
                    } else if(character.toInt >= 65 && character.toInt <= 90) {
                        PlainText += ((((character.toInt) + 26 - 65 - Shift) % 26) + 65).toChar;
                    } else {
                        PlainText += character;
                    }

        return PlainText;
    }

}