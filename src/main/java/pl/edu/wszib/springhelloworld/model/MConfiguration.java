package pl.edu.wszib.springhelloworld.model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MConfiguration {

    @Bean
    public Drzwi drzwi(){
        return new Drzwi();
    }

    @Bean
    public Karoseria karoseria (Drzwi drzwi){
        return new Karoseria(drzwi);
    }

    @Bean
    public Silnik silnik (){
        return new Silnik();
    }

    @Bean
    public Samochod samochod (Karoseria karoseria, Zawieszenie zawieszenie){
        return new Samochod(karoseria, zawieszenie);
    }


    @Bean
    public Zawieszenie zawieszenie(Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, UkladSterowania ukladSterowania){
        return new Zawieszenie(silnik, skrzyniaBiegow, ukladSterowania);
    }
    @Bean
    public UkladSterowania ukladSterowania(Kierownica kierownica){
        return new UkladSterowania(kierownica);
    }
}
