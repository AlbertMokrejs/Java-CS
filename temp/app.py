from flask import Flask, render_template, session
from flask import redirect, url_for

app = Flask(__name__)

@app.route("/")
def home():
    if "in" not in session:
        session["in"] = false
    if "in":
        mes = """<button><a href = "/secret"> Visit The Secret </a></button><hr>
            <button><a href = "/logout"> logout </a></button>"""
    else:
        mes = '<button><a href = "/login"> Login to see the secret </a></button>'
    return render_template(home.html, m = mes)
        

@app.route("/login",methods=["GET","POST"])
def login():
    if "in" not in session:
        session["in"] = false
    if request.method=="GET":
        return render_template("login.html")
    else:
        uname = request.form['user']
        pword = request.form['pass']
        button = request.form['button']
        if uname=="good" and pword=="egg":
            session["in"] = true
            return redirect(url_for("secret"))
        else:
            error = "Bad egg."
            return render_template("login.html",err=error)

@app.route("/secret")
def secret():
    if "in" not in session:
        session["in"] = false
    if not session["in"]:
        return redirect(url_for("login"))
    else:
        mes = """The secret to a good omellete is the eggs. <hr>
            <button><a href = "/logout"> Logout </a></button>"""
    return render_template(home.html, m = mes)

@app.route("/logout")
def out():
    session["in"] = false
    return redirect(url_for(""))

if __name__ == "__main__":
   app.debug = True
   app.secret_key = "Don't store this on github"
   app.run(host="0.0.0.0", port=8000)
