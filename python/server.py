from flask import Flask
from flask_restful import Api, Resource, reqparse

app = Flask(__name__)
api = Api(app)

class Hello(Resource):
    def get(self, name):
        return {"greeting":"Hello "+name}

api.add_resource(Hello,"/hello/<string:name>")
app.run(debug=True)
