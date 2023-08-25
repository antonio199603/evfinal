package com.antonio.eco04juan.dao;

import com.antonio.eco04juan.entity.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibrosDao {

    private static List<Libro> lista = new ArrayList<>();

    public List<Libro> ListarLIbros(){

        return lista;
    }

    private Libro Buscar_Libro(int codigo)
    {
        Libro obj = null;

        for (Libro x : lista)
        {
            if (x.getCodlibro() == codigo)
            {
                obj = x;
                break;
            }
        }
        //
        return obj;
    }

    public String Actualizar_Libro(Libro actualizado)
    {
        Libro buscado = Buscar_Libro(actualizado.getCodlibro());
        //
        if (buscado != null)
        {
            buscado.setFavorito(actualizado.getFavorito());
            return "Libro Añadido Correctamente";
        }
        else
            return "Error, Libro no encontrado";
    }

    public void Cargar_LIbros()
    {

        lista.add(new Libro(1, "El Principito","Antoine de Saint-Exupéry","Fabula",
                "El Principito es una narración corta del escritor francés Antoine de Saint-Exupéry. La historia se centra en un pequeño príncipe que realiza una travesía por el universo. En este viaje descubre la extraña forma en que los adultos ven la vida y comprende el valor del amor y la amistad.",
                30.0,
                "https://www.google.com/search?sa=X&sca_esv=559959589&rlz=1C1UEAD_esPE988PE988&hl=es-419&biw=1707&bih=786&sxsrf=AB5stBi0vkIihXK5LcpwgqyAjp8oHEmNwA:1692945773453&q=El+principito&stick=H4sIAAAAAAAAAOOQUeLWT9c3NDLMLqjISjKSyMlMKsovVihILEpUSEzJz0ktTk7NK0ktjmKDyJxi5AGrT8qLL6wyjD_FyAviGhYVWhQU5pYkn2Lk1M_VNzC0TDc2OsXIBWKnVxqWm2WdYuQAc7IrzKHiJpUpJVVppxih9mdUGKUZwYxLTyk0zs6pNITxs4otLUySkkx_MUr44HBgAwvjIlZe1xyFgqLMvOTMgsyS_AlsjLfYJBlurehRaZiedWOb6pZgp5ofVgqsf43stBb4AAC-xMAy_AAAAA&ved=2ahUKEwikms27mveAAxVkCbkGHTcLCJIQ-BZ6BAgoEDs", true));
        lista.add(new Libro(2, "Orgullo y Perjuicio","Jane Austen","Novela, Ficción, Romance",
                "Orgullo y prejuicio narra las aventuras y desventuras amorosas de las hermanas Bennet, centrándose en el personaje de Elizabeth, a través de las cuales la autora nos presenta con comicidad la sociedad de su tiempo y coloca a la mujer en un lugar más notorio que el que le correspondía en su época",
                40.0,
                "https://www.google.com/search?sa=X&sca_esv=559959589&rlz=1C1UEAD_esPE988PE988&hl=es-419&biw=1707&bih=786&sxsrf=AB5stBi0vkIihXK5LcpwgqyAjp8oHEmNwA:1692945773453&q=Orgullo+y+prejuicio&stick=H4sIAAAAAAAAAOOQUeLRT9c3NErKiy-sMow3ksjJTCrKL1YoSCxKVEhMyc9JLU5OzStJLY5ig8icYkTRcIqRF8Q1LCq0KCjMLUk-xcipn6tvYGiZbmx0ipELxE6vNCw3yzrFyAHmZFeYQ8VNKlNKqtJOMXKDzTPMqDBKM4IZl55SaJydU2kI42cVW1qYJCWZ_mKU8MHhwAYWxkWswv5F6aU5OfkKlQoFRalZpZnJmfkT2BhvsUky3FrRo9IwPevGNtUtwU41P6wUWP8a2Wkt8AEAVz-djwMBAAA&ved=2ahUKEwikms27mveAAxVkCbkGHTcLCJIQ-BZ6BAgoEAU", true));
        lista.add(new Libro(3, "El guardián entre el centeno","J. D. Salinger"," Novela, Novela de aprendizaje, Ficción adulto joven",
                " Las inquietudes del adolescente, el paso a la madurez, el conflicto interior en una personalidad difícil. o La crítica hacia la hipocresía de las personas y de la sociedad es, probablemente el tema principal de la novela.",
                35.0,
                "https://www.google.com/search?sa=X&sca_esv=559959589&rlz=1C1UEAD_esPE988PE988&hl=es-419&sxsrf=AB5stBi0vkIihXK5LcpwgqyAjp8oHEmNwA:1692945773453&q=El+guardi%C3%A1n+entre+el+centeno&stick=H4sIAAAAAAAAAOOQUeLUz9U3MLRMNzYyksjJTCrKL1YoSCxKVEhMyc9JLU5OzStJLY5ig8icYuTRT9c3NErKiy-sMow_xcgL4hoWFVoUFOaWJJ9iRBh2ipELxE6vNCw3yzrFyAHmZFeYQ8VNKlNKqtJOMXKDzTPMqDBKM4IZl55SaJydU2kI42cVW1qYJCWZ_mKU8MHhwAYWxkWssq45CumliUUpmYcX5ikAxYtSFVJzFMAq8vInsDHeYpNkuLWiR6VhetaNbapbgp1qflgpsP41stNa4AMAL7d9PgoBAAA&ved=2ahUKEwikms27mveAAxVkCbkGHTcLCJIQ-BZ6BAgoEAs&biw=1707&bih=786&dpr=1.13", true));
        lista.add(new Libro(4, "Los juegos del hambre","Suzanne Collins","Novela, Ficción, Ciencia ficción",
                "Para demostrar su poder, el régimen del estado totalitario de Panem organiza cada año \"Los juegos del hambre\". En ellos, 24 jóvenes compiten el uno contra el otro en una batalla en la que solo puede haber un superviviente. La joven Katniss se ofrece voluntaria para participar en los juegos para salvar a su hermana. Junto a ella participará Peeta, un joven al que ha conocido desde la infancia y que está enamorado de ella. Sin embargo, el Capitolio quiere convertirlos en contrincantes.",
                45.0,
                "https://www.google.com/search?sa=X&sca_esv=559959589&rlz=1C1UEAD_esPE988PE988&hl=es-419&biw=1707&bih=786&sxsrf=AB5stBi0vkIihXK5LcpwgqyAjp8oHEmNwA:1692945773453&q=Los+juegos+del+hambre&stick=H4sIAAAAAAAAAOOQUeLSz9U3MKlMKalKM5LIyUwqyi9WKEgsSlRITMnPSS1OTs0rSS2OYoPInGLk0U_XNzRKyosvrDKMP8XIC-IaFhVaFBTmliSfYuQEmWZomW5sdIoRbHJ6pWG5WdYpRg4wJ7vCHCoOsfEUIzfYPMOMCqM0I5hx6SmFxtk5lYYwflaxpYVJUpLpL0YJHxwObGBhXMQq6gOUyipNTQdSKak5ChmJuUlFqRPYGG-xSTLcWtGj0jA968Y21S3BTjU_rBRY_xrZaS3wAQDq6AuoAwEAAA&ved=2ahUKEwikms27mveAAxVkCbkGHTcLCJIQ-BZ6BAgoEBQ", true));
        lista.add(new Libro(5, "Invisible","Eloy Moreno","Ficción",
                "el drama que vive un niño en un centro escolar; una historia de la que es imposible salir indemne. Llega un momento en que el dolor de este niño es tan inconmensurable que eres tú quien lo siente",
                30.0,
                "https://www.google.com/search?sa=X&sca_esv=559959589&rlz=1C1UEAD_esPE988PE988&hl=es-419&sxsrf=AB5stBi0vkIihXK5LcpwgqyAjp8oHEmNwA:1692945773453&q=INVISIBLE&stick=H4sIAAAAAAAAAOOQUeLVT9c3NExPKTTOzqk0NJLIyUwqyi9WKEgsSlRITMnPSS1OTs0rSS2OYoPInGLkAekwSsqLL6wyjD_FCDGgqNCioDC3JPkUI6d-rr6BoWW6sdEpRi4QO73SsNws6xQjB5iTXWEOFTepTCmpSjvFyA02zzCjwijNCGYczD0wflaxpYVJUpLpL0YJHxwObGBhXMTK6ekX5hns6eTjOoGN8RabJMOtFT0qDdOzbmxT3RLsVPPDSoH1r5Gd1gIfAAmFPKX6AAAA&ved=2ahUKEwikms27mveAAxVkCbkGHTcLCJIQ-BZ6BAgoEBo&biw=1707&bih=786&dpr=1.13", true));
        lista.add(new Libro(6, "El niño con el pijama de rayas","John Boyne","Novela, Ficción histórica, Literatura infantil, Fábula",
                "La acción se narra desde el punto de vista de Bruno, el hijo de nueve años de un militar nazi de alto rango. \u200B Él y su familia se ven obligados a abandonar Berlín cuando a su padre lo destinan para trabajar en el campo de concentración de Auschwitz. La familia acepta el cambio pero no de buen grado.",
                43.0,
                "https://www.google.com/search?sa=X&sca_esv=559959589&rlz=1C1UEAD_esPE988PE988&hl=es-419&biw=1707&bih=786&sxsrf=AB5stBi0vkIihXK5LcpwgqyAjp8oHEmNwA:1692945773453&q=El+ni%C3%B1o+con+el+pijama+de+rayas&stick=H4sIAAAAAAAAAOOQUeLUz9U3SDEvSso1ksjJTCrKL1YoSCxKVEhMyc9JLU5OzStJLY5ig8icYuTRT9c3NErKiy-sMow_xcgL4hoWFVoUFOaWJJ9iBBtmaJlubHSKkQvETq80LDfLOsXIAeZkV5hDxU0qU0qq0k4xcoPNM8yoMEozghmXnlJonJ1TaQjjZxVbWpgkJZn-YpTwweHABhbGRazyrjkKeZmHN-YrJOfnKaTmKBRkZiXmJiqkpCoUJVYmFk9gY7zFJslwa0WPSsP0rBvbVLcEO9X8sFJg_Wtkp7XABwDZU5LyDAEAAA&lei=fk3oZJuxCqmw5OUPvrKzgAQ", true));

    }


}
