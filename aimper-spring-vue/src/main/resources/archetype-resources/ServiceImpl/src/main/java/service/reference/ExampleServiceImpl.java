package ${package}.service.reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.general.service.BaseServiceImpl;


@Service
@Transactional
public class ExampleServiceImpl extends BaseServiceImpl implements ExampleService {
    /**
     * Loads example short info
     * @param id example id
     * @return
     */
    @Override
    public ExampleShortDto loadExample(Long id) {
        //TODO implement
        return null;
    }

    /**
     * Creates (or updates) example. Returns id of saved or created example.
     * @param example info to save
     * @return id of saved example.
     */
    @Override
    public Long saveExample(ExampleShortDto example) {
        //TODO implement
        return null;
    }
}