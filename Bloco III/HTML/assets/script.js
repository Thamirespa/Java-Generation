/*var nome = window.document.querySelector('#nome')*/

var nome = window.document.getElementById('nome')
var email = window.document.getElementById('email')
var tema = window.document.getElementById('tema')

var okNome = false

function validarTudo(){
    let txtNome = document.getElementById ('txtNome')
    let txtEmail = document.getElementById ('txtEmail')
    let txtTema = document.getElementById ('txtTema')
    if(nome.value.length < 2){
       // alert('Olá Mundo!!')
        txtNome.innerHTML = 'nome invalido'
        txtNome.style.color = 'red'
        okNome = false
    }else{
        txtNome.innerHTML = 'deu bom'
        txtNome.style.color = 'green'
        okNome = true
    }

    if(email.value.length < 2){
        // alert('Olá Mundo!!')
         txtEmail.innerHTML = 'email invalido'
         txtEmail.style.color = 'red'
         okNome = false
     }else{
         txtEmail.innerHTML = 'deu bom'
         txtEmail.style.color = 'green'
         okNome = true
     }

     if(tema.value.length < 2){
        // alert('Olá Mundo!!')
         txtTema.innerHTML = 'texto invalido'
         txtTema.style.color = 'red'
         okNome = false
     }else{
         txtTema.innerHTML = 'deu bom'
         txtTema.style.color = 'green'
         okNome = true
     }
}

function enviar() {
    if (okNome == true) {
        alert('Mensagem enviada com sucesso!!')
    } else {
        alert('Preencha corretamente!')

    }
}
