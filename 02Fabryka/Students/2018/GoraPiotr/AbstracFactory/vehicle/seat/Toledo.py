from element_factory.ElementFactory import ElementFactory
from vehicle.seat.Seat import Seat


class Toledo(Seat):

    def __init__(self, element_factory: ElementFactory):
        super(Toledo, self).__init__(element_factory)

    def prepare(self):
        self.motor = self.element_factory.get_motor()
        self.sensors = self.element_factory.get_sensors_list()
