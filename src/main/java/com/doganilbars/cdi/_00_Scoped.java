package com.doganilbars.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;

//Kapsam
//Yaşam Süresi
//Performansımızı + -
@Named
//@ApplicationScoped //Bütün uygulama boyunca çalışıyor, bütün kullanıcılar
//@RequestScoped // Bir istek boyunca çalışıyor
//@SessionScoped //Bir kullanıcı için yaşar ancak logout olunca biter
//@Dependent // Bukalemun
//@ConversationScoped //belli bir istek boyunca yaşar
//@SessionScoped //Bean 1 instance olmasını sağlamak için
public class _00_Scoped {
}
