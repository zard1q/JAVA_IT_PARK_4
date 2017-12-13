import java.util.List;

public class HumanService {

    private HumansDao humansDao;

    public HumanService(HumansDao humansDao) {
        this.humansDao = humansDao;
    }

    public void registerUser(Human user) {
        // смотрим, нет ли человека с таким именем,
        String name = user.getName();

        Human existingHuman = humansDao.findOneByName(name);

        if (existingHuman != null) {
            // если есть - выбрасываем ошибку, если нет - сохраняем
            throw new IllegalArgumentException("Already exist");
        }

        humansDao.save(user);

    }

    public void deleteUser (Human user) {
        String name = user.getName();
        Human existingHuman = humansDao.findOneByName(name);
        if (existingHuman != null) {
            humansDao.delete(existingHuman.getId());
        }
    }

    public Human findUser(Long id) {
        Human existingHuman = humansDao.find(id);
        if (existingHuman != null) {
            return existingHuman;
        }
        return null;
    }

    public void updateUser(Human user) {
        humansDao.update(user);
    }
    public List<Human> showAll() {
        return humansDao.findAll();

    }
}