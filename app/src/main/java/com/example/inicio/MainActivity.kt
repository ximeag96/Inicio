package com.example.inicio
//(a esto
//si borramos un import,  ponemos alt+enter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //capa vista
        //vamos a quitar la barrita superior llamada Actionbar
        supportActionBar?.hide()
        //invocamos al botón mdiante su id
        // nos va a importar
        // Ingresar, enter y nos va a importar --(a
        Ingresar.setOnClickListener {
            //view que podemos poner vistas
            //{} que nos etorna otro metodo
            //generamos la navegaión usando otra clase que se llama intent nos ayuda a enlazar una activity con otra , hace mas cosas pero en este cao usarmos asi
            //en kotlin todos son objetos y java es sub orientado a objetos porque usa primitivos como int, float, etc
            // var es de variabe
            // como todos son objetos se omite la palabra new
            // el constructor de tipo intent se asigna a la variable i
            //this palabra reservada hace rferncia al objeto general que es nuetra activity y el login es al otro objeto activity2 , clas.java referenci a la segunda activity
            var i=Intent(this, LoginActivity::class.java)
            //this,LoginActivity::class.java enter
            //primer argumento esta activity y el segundo argumento es la sgunda activity donde nos vamos a enlazar
            startActivity(i)
            //startactivity intent: Intent)


        }
    }
}
